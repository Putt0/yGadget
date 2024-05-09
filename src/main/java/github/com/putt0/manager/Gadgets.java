package github.com.putt0.manager;

public enum Gadgets {

    CAPS("Boné", "\n §7Sinta-se bastante estiloso."),
    COVERS("Capa", "\n §7Selecione uma de nossas capas."),
    PARICLES("Partícula", "\n §7Deseja atenção? Selecione uma das partículas."),
    TOYS("Brinquedos", "\n §7Está cansado? Selecione um briquedo e divirta-se.");

    private final String type, description;

    Gadgets(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}