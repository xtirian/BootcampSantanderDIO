public class EstruturacaoMetodos {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // métodos devem ser nomeados como verbo

    }

    /*
     * public double somar(int num1, int num2){
     * //LOGICA
     * return ... ;
     * }
     * 
     * public void inprimir(String texto) {
     * //LOGICA...
     * //AQUI NÃO PRECISA DO RETURN
     * // POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
     * }
     * 
     * 
     * //throws exception: indica que o método ao ser utilizado
     * // pode gerar uma exceção
     * 
     * public double dividir(int dividendo, int divisor) throws Exception {
     * //LOGICA
     * }
     * 
     * 
     * private void metodoPrivado(){} //Este método não pode ser visto por outras
     * classes
     * 
     * //alguns EQUIVOCOS estruturais
     * public void validar() {
     * //Este método deveria retornar uma validação boolean true ou false
     * //mas foi marcado como void
     * }
     * 
     * public void calcularEnviar(){
     * //um método deve apresentar apenas uma unica responsabilidade
     * }
     * 
     * 
     * public void gravarCliete(String nome, String cpf, Integer ){
     * // este método tem a finalidade de gravar
     * // informações de um cliente, então por que não criar
     * // um objeto chamado cliente?
     * // quando um método recebe muitos parâmetros e estes parâmetros podem
     * // ser a abstração de um objeto, nós precisamos trazer
     * // essa capacidade de abstração
     * }
     * 
     * //SOLUÇÃO:
     * 
     * public void gravarCliente(Cliente cliente){}
     * //ou
     * public void gravar(Cliente cliente){}
     * 
     */

}
