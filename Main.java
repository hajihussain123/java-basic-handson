class Main {
  public static void main() {
    System.out.println(StringUtils.containsChar("Hello", 'l')); // true
    System.out.println(StringUtils.reverse("Hello")); // "olleH"
    System.out.println(StringUtils.replaceAll("Hello", 'l', 'L')); // "HeLLo" 

    Money twelveRupee = new Money(12);
    Money tenRupee = new Money(10);
    
    Money twentyTwoRupee = twelveRupee.add(tenRupee);
    Money twoRupee = twelveRupee.minus(tenRupee);

    System.out.println(twentyTwoRupee.value); // 22
    System.out.println(twoRupee.value); // 2

    System.out.println(twelveRupee.value); // 12
    System.out.println(tenRupee.value); // 10

    twoRupee.value = 22; // error
  }
}