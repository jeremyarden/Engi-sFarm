import junit.framework.TestCase;

/**
 * Unit testing kelas Product
 * 
 * @author Muhammad Raihan Asyraf Desanto / 13517027
 */

public class TestProduct extends TestCase {
  private Product product;

  /**
   * tesGetterName method untuk mengetes method getName()
   */
  public void tesGetterName() {
    product = new Product("Dino", 100000, true, false);
    assertEqual("Tes atribut name", "Dino", product.getName());
  }

  /**
   * tesGetterPrice method untuk mengetes method getPrice()
   */
  public void tesGetterPrice() {
    product = new Product("Dino", 100000, true, false);
    assertEqual("Tes atribut price", 100000, product.getPrice());
  }

  /**
   * tesGetterFarmProduct method untuk mengetes method getFarmProduct()
   */
  public void tesGetterFarmProduct() {
    product = new Product("Dino", 100000, true, false);
    assertEqual("Tes atribut farmProduct", true, product.getFarmProduct());
  }

  /**
   * tesGetterSideProduct method untuk mengetes method getSideProduct()
   */
  public void tesGetterSideProduct() {
    product = new Product("Dino", 100000, true, false);
    assertEqual("Tes atribut sideProduct", false, product.getSideProduct());
  }

  /**
   * tesProductDefaultConstructor method untuk mengetes apakah konstruktor default
   * dari kelas Product sudah benar.
   */
  public void tesProductDefaultConstructor() {
    product = new Product();
    assertEqual("Tes atribut name", "\0", product.getName());
    assertEqual("Tes atribut price", 0, product.getPrice());
    assertEqual("Tes atribut farmProduct", false, product.getFarmProduct());
    assertEqual("Tes atribut sideProduct", false, product.getSideProduct());
  }

  /**
   * tesProductConstructor method untuk mengetes apakah konstruktor berparameter
   * dari kelas Product sudah benar.
   */
  public void tesProductConstructor() {
    product = new Product("Dino", 100000, true, false);
    assertEqual("Tes atribut name", "Dino", product.getName());
    assertEqual("Tes atribut price", 100000, product.getPrice());
    assertEqual("Tes atribut farmProduct", true, product.getFarmProduct());
    assertEqual("Tes atribut sideProduct", false, product.getSideProduct());
  }
}