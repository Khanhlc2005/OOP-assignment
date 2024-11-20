public class Test {
    public static void main(String[] args) {
        Person nguoi = new Person();
        nguoi.setName("Nam");
        nguoi.setDob("2000");
        nguoi.setPob("Ha Noi");
        nguoi.setEmail("1234@gmail.com");
        nguoi.setGender('M');
        nguoi.setPhone("012345678");
        System.out.println(nguoi.toString());
    }
}
