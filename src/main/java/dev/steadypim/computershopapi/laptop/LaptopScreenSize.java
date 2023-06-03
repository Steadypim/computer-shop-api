package dev.steadypim.computershopapi.laptop;

public enum LaptopScreenSize {
    SIZE_13("13"),
    SIZE_14("14"),
    SIZE_15("15"),
    SIZE_17("17");

    private final String size;

    LaptopScreenSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
