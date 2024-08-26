// O nome da Classe é escriot em CamelCase
public class AulaVariaveis { // Você pode comentar na frente de uma declaração ou linha de instrução
    public static void main(String[] args) {

       // não é recomendado pela Code Conventions da Oracle declarar mais de uma variável em uma mesma linha
       // Exemplo: int minhaIdade = 40, suaIdade = 25; Isso é considerado fora das convenções

       // As variáveis são escritas com o padrão lowerCamelCase (inicia com a letra minuscula e as demais primeiras letras das proximas palavras iniciam com maiusculo) segue exemplo abaixo:
       int minhaIdade = 40;
       int suaIdade = 25;

       int totalIdades = minhaIdade + suaIdade;
       
       System.out.println("Total das idades é: " + totalIdades);

    }


}