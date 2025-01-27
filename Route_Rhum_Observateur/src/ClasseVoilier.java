public enum ClasseVoilier {


    Class40, IMOCA, RhumMono, Multi50, Ultim, RhumMulti, ANY;


    public String toString() {
        switch (this) {
            case Class40: return "Class40";
            case IMOCA: return "Imoca";
            case RhumMono: return "RhumMono";
            case Multi50: return "Multi50";
            case Ultim: return "Ultim";
            case RhumMulti: return "RhumMulti";
            case ANY: return "Any";
        }
        return "";
    }
}
