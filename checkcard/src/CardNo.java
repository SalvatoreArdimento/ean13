import java.util.Scanner;

public class CardNo {
    private String EAN13;
    private boolean flag=true;

    public void setEAN13() {
        Scanner sc = new Scanner(System.in);                                    //Creo scanner per fare l'input
        int i = 0;
                System.out.print("inserisci codice di 12 numeri \n");
                while(flag) {
                        EAN13 = sc.nextLine();
                        if(EAN13.length()!=11) {
                            flag =true;                                        // controllo di 12 caratteri sul codice, il 13esimo verrà calcolato più avanti
                            System.out.print("La stringa deve essere di 12 caratteri\n");
                        }
                          else
                             flag=false;
                        }

                }

        public String getEAN13() {

            return EAN13;
        }

        public int checkSum(String s)
            {
            int i;
            int sum=0;
            int counter=1;                            //Counter verrà utilizzato come contatore e in oltre verrà effettuato "counter%2", se il risultato sarà diverso da
            boolean flag;
            int suppMoltiplicazione;                                        //0 counter verrà sommato normalmente, altrimenti sarà prima moltiplicato x3 e poi sommato
            for (i=0;i<s.length();i++)
                    {
                        if(counter%2!=0)
                        {
                          sum+=Integer.parseInt(String.valueOf(s.charAt(i)));                       }
                            else {
                                   suppMoltiplicazione=Integer.parseInt(String.valueOf(s.charAt(i)))*3;
                                   sum+=suppMoltiplicazione;
                                 }
                            counter++;
                    }       System.out.print(sum+"\n");
                            if(10-(sum%10)==10)
                                return 0;
                            else
                                return 10-(sum%10);

            }


        }





