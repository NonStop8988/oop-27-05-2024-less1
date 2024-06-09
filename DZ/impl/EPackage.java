package DZ.impl;

public enum EPackage {
    PLASTIC("пластик"), GLASS("стекло"), POLYETHYLENE("Полиэтилен");

    private final String material;

    EPackage(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
