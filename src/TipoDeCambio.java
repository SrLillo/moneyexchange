import java.util.Objects;

public final class TipoDeCambio {
    private final String result;
    private final String documentation;
    private final String time_last_update_utc;
    private final String base_code;
    private final String target_code;
    public final double conversion_rate;

    public TipoDeCambio(String result,
                        String documentation,
                        String time_last_update_utc,
                        String base_code,
                        String target_code,
                        double conversion_rate) {
        this.result = result;
        this.documentation = documentation;
        this.time_last_update_utc = time_last_update_utc;
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
    }

    public double conversion_rate() {
        return conversion_rate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (TipoDeCambio) obj;
        return Objects.equals(this.result, that.result) &&
                Objects.equals(this.documentation, that.documentation) &&
                Objects.equals(this.time_last_update_utc, that.time_last_update_utc) &&
                Objects.equals(this.base_code, that.base_code) &&
                Objects.equals(this.target_code, that.target_code) &&
                Double.doubleToLongBits(this.conversion_rate) == Double.doubleToLongBits(that.conversion_rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, documentation, time_last_update_utc, base_code, target_code, conversion_rate);
    }

    @Override
    public String toString() {
        return "TipoDeCambio[" +
                "result=" + result + ", " +
                "documentation=" + documentation + ", " +
                "time_last_update_utc=" + time_last_update_utc + ", " +
                "base_code=" + base_code + ", " +
                "target_code=" + target_code + ", " +
                "conversion_rate=" + conversion_rate + ']';
    }

}
