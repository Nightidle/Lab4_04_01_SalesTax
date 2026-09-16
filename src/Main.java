//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
double priceOfPurchase = 23.99;
double salesTax = 0.05;
double totalPrice = 0;

totalPrice = priceOfPurchase + (priceOfPurchase * salesTax);

System.out.println("The total price of your purchase with a 5% sales tax is " + totalPrice);
}
