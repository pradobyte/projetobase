package java.br.com.projetobase.domain.model;

public record Canal(Tipo tipo, String destinatario) {

    public enum Tipo {
        EMAIL,
        SMS,
        WHATSAPP
    }
}
