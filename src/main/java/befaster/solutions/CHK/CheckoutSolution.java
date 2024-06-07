package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int i, total = 0, totalA = 0, totalB = 0, totalC = 0, totalD = 0;
        for(i = 0; i < skus.length(); i++){
            switch (skus.charAt(i)) {
                case 'A':
                    totalA ++;
                    if(totalA == 3){
                        total = total - 150 + 130;
                    }
                    break;
            
                case 'B':
                    break;

                case 'C':
                    break;

                case 'D':
                    break;

                default:
                    return -1;
            }
        }
        return total;
    }
}


