public class Orden {
    //public Date fecha;
    public String lugarOrigen;
    public String lugarDestino;

    public Orden(/*Date fecha,*/ String lugarOrigen, String lugarDestino){
        //this.fecha = fecha;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
    }

    public String getOrigen(){
        return this.lugarOrigen;
    }

    public String getDestino(){
        return this.lugarDestino;
    }
}
