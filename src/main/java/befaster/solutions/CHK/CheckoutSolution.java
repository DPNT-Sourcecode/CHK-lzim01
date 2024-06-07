package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int i, total = 0, totalA = 0, totalB = 0, totalC = 0, totalD = 0;
        for(i = 0; i < skus.length(); i++){
            switch (skus.charAt(i)) {
                case 'A':
                    totalA ++;
                    // if totalA % 5 == 0, fifth one is free
                    if(totalA % 5 != 0){
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
                    if(totalB % 2 == 0){
                        total += 15;
                    }
                    else{
                        total += 30;
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
                    to

                default:
                    return -1;
            }
        }
        return total;
    }
}
