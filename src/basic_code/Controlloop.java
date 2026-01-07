package basic_code;

public class Controlloop {

	public static void main(String[] args) {
	 System.out.println("FOR LOOP:");
		        for (int i = 1; i <= 5; i++) {
		            if (i == 3) {
		                continue;  
		            }
		            System.out.println(i);
		        }

		        System.out.println("\nWHILE LOOP:");
		        int j = 1;
		        while (j <= 5) {
		            if (j == 4) {
		                break;     
		            }
		            System.out.println(j);
		            j++;
		        }

		        System.out.println("\nDO-WHILE LOOP:");
		        int k = 1;
		        do {
		            System.out.println(k);
		            k++;
		        } while (k <= 3);

		        System.out.println("\nFOR-EACH LOOP:");
		        int[] numbers = {10, 20, 30, 40};
		        for (int num : numbers) {
		            System.out.println(num);
		        }
		    }
		}
