package resto;

public class Cochon  implements Visitable {
  /*
  1 peso mexicain = 0.0436 euros
   */
  public String pays = "Mexique";
  public Double prixPesoKg=10000.0;
  public Double poidsKilos=5.0;
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
