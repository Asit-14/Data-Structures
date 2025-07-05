public class defangingip_address {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        defangingip_address solution = new defangingip_address();

        // Test cases
        String[] testCases = {
                "1.1.1.1",
                "255.100.50.0",
                "192.168.1.1",
                "127.0.0.1",
                "10.0.0.1"
        };

        System.out.println("Testing IP address defanging:");
        System.out.println("=============================");

        for (String testCase : testCases) {
            String result = solution.defangIPaddr(testCase);
            System.out.println("Original: " + testCase);
            System.out.println("Defanged: " + result);
            System.out.println();
        }
    }
}
