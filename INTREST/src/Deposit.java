class Deposit{
    public int dep_id,dep_duration,acc_id;
    public double annual_int,int_rate,dep_amo;

    public void InputFDdet(int dep_id,int dep_duration,double dep_amo){
        this.dep_id = dep_id;
        this.dep_amo = dep_amo;
        this.dep_duration = dep_duration;
    }
    public void Findintrest(){
        if(dep_duration > 1 ){
            int_rate= 0.15;
        } else if (dep_duration>2) {
            int_rate = 0.12;
        }
        else {
           int_rate= 0.15;
        }
        annual_int = dep_amo * int_rate;

    }
    public void DisplayFDdet(){
        System.out.println("Your deposit id is " +dep_id);
        System.out.println("Your deposit ammount" +dep_amo);
        System.out.println("your anual intrest is " +annual_int);
        System.out.println("-------------------------------------------------");
    }
}