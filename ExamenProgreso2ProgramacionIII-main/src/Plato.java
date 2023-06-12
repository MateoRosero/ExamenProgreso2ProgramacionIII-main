public class Plato {

        private String nombre;
        private double precio;
        private int calorias;
        private int tiempoPreparacion;

        public Plato(String nombre, double precio, int calorias, int tiempoPreparacion) {
            this.nombre = nombre;
            this.precio = precio;
            this.calorias = calorias;
            this.tiempoPreparacion = tiempoPreparacion;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }



        public int getCalorias() {
            return calorias;
        }



        public int getTiempoPreparacion() {
            return tiempoPreparacion;
        }





}
