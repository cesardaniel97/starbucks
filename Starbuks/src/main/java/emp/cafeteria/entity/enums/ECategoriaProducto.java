package emp.cafeteria.entity.enums;

public enum ECategoriaProducto {

	CAFE("CAF-"),
    POSTRE("POS-"),
    BEBIDA("BEB-"),
    SANDWICH("SAN-"),
    ACCESORIO("ACC-"),
    GRANO("GRA-"),
    MERCH("MER-");

    private final String prefijoCodigo;

    ECategoriaProducto(String prefijoCodigo) {
        this.prefijoCodigo = prefijoCodigo;
    }

    public String getPrefijoCodigo() {
        return prefijoCodigo;
    }
}
