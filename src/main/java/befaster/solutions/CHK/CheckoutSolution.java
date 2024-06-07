package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int i, total = 0, totalA = 0, totalB = 0, sumB =0 , totalC = 0;
        int totalD = 0, totalE = 0, freeB = 0;
        int totalF = 0, freeF = 0, contor = 0;
        int totalH = 0, totalK = 0, totalN = 0, totalM = 0, freeM = 0, totalP = 0, totalQ = 0;
        int freeQ = 0, totalR = 0;
        for(i = 0; i < skus.length(); i++){
            switch (skus.charAt(i)) {
                case 'A':
                    totalA ++;
                    if(totalA % 5 == 0){
                        total += 20;
                        totalA = 0;
                    }
                    else{
                        if(totalA % 3 == 0){
                        total += 30;
                        }
                        else{
                            total += 50;
                        }
                    }
                    break;
                
                case 'H':
                    totalH ++;
                    if(totalH % 10 == 0){
                        total -= 5;
                        totalH = 0;
                    }
                    else{
                        if(totalH % 5 == 0){
                        total += 5;
                        }
                        else{
                            total += 10;
                        }
                    }
                break;    

                case 'B':
                    totalB ++;
                    break;

                case 'C':
                case 'G':
                case 'T':
                case 'W':
                    totalC ++;
                    total += 20;
                    break;

                case 'D':
                    total += 15;
                    break;

                case 'M':
                    totalM ++;
                    total += 15;
                    break;

                case 'E':
                    totalE ++;
                    total += 40;
                    if(totalE % 2 == 0){
                        freeB ++;
                    }
                    break;

                case 'F':
                    if(contor == 1){
                        contor = 0;
                    }
                    else{
                        totalF ++;
                        if(totalF % 2 == 0){
                            freeF ++;
                            contor = 1;
                        }
                    }
                    break;
                
                case 'I':
                    total += 35;
                    break;

                case 'J':
                    total += 60;
                    break;

                case 'K':
                    totalK ++;
                    if(totalK % 2 ==0){
                        total +=  70;
                    }
                    else{
                        total += 80;
                    }
                    break;

                case 'L':
                case 'X': 
                    total += 90;
                    break;

                case 'N':
                    total += 40;
                    totalN ++;
                    if(totalN % 3 == 0){
                        freeM ++;
                    }
                    break;

                case 'O':
                    total += 10;
                    break;

                case 'P':
                    totalP ++;
                    if(totalP %5 != 0){
                        total += 50;
                    }
                    break;

                case 'Q':
                    totalQ ++;
                    if(totalP %3 == 0){
                        total += 20;
                    }
                    else{
                        total += 30;
                    }
                    break;

                case 'R':
                    totalR ++;
                    total += 50;
                    if(totalR % 3 == 0){
                        freeQ ++;
                    }

                default:
                    return -1;
            }
        }
        totalB -= freeB;
        if(totalB < 0){
            totalB = 0;
        }
        total += totalB * 30 - totalB/2 * 15;     
        total += totalF * 10;
        if(freeM >= totalM){
            total -= freeM * 15;
        }
        else{
            totalM -= totalM * 15;
        }

        if(freeQ >= totalQ){
            total -= freeQ * 15;
        }
        else{
            totalQ -= totalQ * 15;
        }
        return total;
    }
}


