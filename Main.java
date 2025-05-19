//Strings Day 3
class Main {
    public static void main(String[] args) {
        String s1 = "Hari"; // Created inside scp
        String s2 = "Hari"; // Created inside scp
        String s3 = new String("Sirikonda"); // Heap memory
        String s4 = new String("Sirikonda"); // Heap memory
        System.out.println(s1.equals(s2));// Compares original content
        System.out.println(s1 == s2); // compares the memory locations
        System.out.println(s1.compareTo(s2));// Compares lexicographically
        System.out.println(s3 == s4); // compares the memory locations
    }
}