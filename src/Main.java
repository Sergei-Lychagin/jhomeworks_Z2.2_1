public class Main {
    public static void main(String[] args) throws Exception {
        BonusMilesService service = new BonusMilesService();       
        int miles = service.calculate(10000);
        System.out.println("Your bonus is" + "  " + miles + " " + "mil");
    }
}
