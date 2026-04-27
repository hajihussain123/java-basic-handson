// Money.java

class Money {
  final int value;

  Money(int value) {
    this.value = value;
  }

  public Money add(Money addend) {
    return new Money(this.value + addend.value);
  }

  public Money minus(Money subtractor) {
    return new Money(this.value - subtractor.value);
  }

}