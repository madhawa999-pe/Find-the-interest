 class Display {
    public static void main(String[]args){
        Deposit d1 = new Deposit();
        d1.InputFDdet(001,3,90000);
        d1.Findintrest();
        d1.DisplayFDdet();

        Deposit d2 = new Deposit();
        d2.InputFDdet(002,1,30000);
        d2.Findintrest();
        d2.DisplayFDdet();



    }
}
