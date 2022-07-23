
package enviando_mail.enviando_mail;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Properties;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Application")
public class ApplicationTest {
	/*Para cada email que for conectar, tem que se conncetar com o Servidor
	 * do email, o Gmail tem o seu servidor, cada email tem o se Servidor*/
    
	/*Primeira coisa que agente precisa é definir as propiedades de conexao com o servidor
	 * Para  cada email que for usar tem que verificar as configurações necessarias para 
	 * conexão para cada email.
	 * O smtp: ele é responsavel por ter as configurações necessarias para conexao com o servidor de 
	 * cada email. cada email tem seu smtp.
	 * 
	 * podemos ver a documentação javamail tutorial no google para acessar a documentação
	 * */
	
	@Test
	public void testeEmail() {
		//configuração das propiedades
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");//Autorização
		properties.put("mail.smtp.starttls", "true");//Autenticação
		properties.put("mail.smtp.host", "smtp.gmail.com");//servidor gmail google
		properties.put("mail.smtp.socketFactory.port", "465");//especifica a porta a ser conectada pelo socket
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");/*Classe socket de conexao ao SMTP*/
	}
 
}
