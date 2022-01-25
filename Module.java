public class Module {
    public static void main (String[] args) {
        String module = "CSC1009";
        System.out.print("input " + module + " > Output ");
        switch(module) {
            case "CSC1002":
                System.out.println("Mathematics 1");
                break;
            case "CSC1003":
                System.out.println("Programming Methodology");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC2901":
                System.out.println("Effective Communication");
                break;
        }
    }
}
