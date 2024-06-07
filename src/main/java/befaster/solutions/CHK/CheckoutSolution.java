package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int i, total = 0, totalA = 0, totalB = 0, sumB =0 , totalC = 0;
        int totalD = 0, totalE = 0, freeB = 0;
        int totalF = 0, freeF = 0, contor = 0;
        int totalH = 0;
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
                case 'M':
                    totalD ++;
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

                case 'J':
                    total += 60;
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
        return total;
    }
}







