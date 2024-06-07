package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int i, total = 0, totalA = 0, totalB = 0, totalC = 0, totalD = 0, totalE = 0, freeB = 0;
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
            
                case 'B':
                    totalB ++;
                    if(freeB > 0){
                        totalB -= freeB;
                        total = total + totalB * 30 - totalB/2 * 15;
                        totalB += freeB;
                        freeB = 0;
                    }
                    else{
                        
                        if(totalB % 2 == 0){
                            total += 15;
                        }
                        else{
                            total += 30;
                        }
                    }
                    
                    break;

                case 'C':
                    totalC ++;
                    total += 20;
                    break;

                case 'D':
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
                
                default:
                    return -1;
            }
        }
        return total;
    }
}



