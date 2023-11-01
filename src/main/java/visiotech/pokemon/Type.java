package visiotech.pokemon;

public enum Type {
    ACERO(0),
    AGUA(1),
    BICHO(2),
    DRAGON(3),
    ELECTRICO(4),
    FANTASMA(5),
    FUEGO(6),
    HADA(7),
    HIELO(8),
    LUCHA(9),
    NORMAL(10),
    PLANTA(11),
    PSIQUICO(12),
    ROCA(13),
    SINIESTRO(14),
    TIERRA(15),
    VENENO(16),
    VOLADOR(17);

    private final int number;

    private Type(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
