package SuprimentoInformatica;

public class App {

    public static void main(String[] args) {
        //Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informatica
        //para representar uma fatura de um item vendido na loja;
        //Uma fatura deve incluir as seguintes informa��es e atributos;
        //a -> o numero do item faturado
        //b -> a descricao do item
        //c -> a quantidade comprada do item 
        //d -> o pre�o unitario do item.
        //Sua classe deve ter um construtor que inicialize os quatros atributos. Se a quantidade nao for
        //positiva ela deve ser configurada como 0. Se o pre�o por item nao for possitivo, ele deve ser configurado
        //como 0.0. Forne�a um metodo set e um metodo get para cada variavel de instancia;
        //ALem disso forne�a um metodo chamado getInVoidAmount que calcula o valor da fatura (isso �,
        //multiplica a quantidade pelo pre�o por item) e depois retorna o valor como um double.
        //Escreva um aplicativo de teste que demonstra as capacidades da classe invoic.

        Invoice invoice = new Invoice(1, "MousePad", 10, 50.0f);
        System.out.println("Valor total igual: "+ invoice.getVoiceAmount());
    }
}
