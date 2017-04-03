import java.util.Date;

/**
 * Created by thiago on 03/04/2017.
 */
public class Voo extends Compania {

    private Date data;
    private Date horario;
    private String origem;
    private String destino;

    public Voo(Date data, Date horario, String origem, String destino) {
        this.data = data;
        this.horario = horario;
        this.origem = origem;
        this.destino = destino;
    }


    //GETSETS--------------------------

}
