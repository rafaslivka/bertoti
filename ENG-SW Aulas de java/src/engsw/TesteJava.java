import static org.junit.jupiter.api.Assertions.*;

 

class TesteJava {
	
@Test 
void test() {
	SalaAula fatec = new SalaAula();
	Aluno joao = new Aluno("Joao", "12345");
	Aluno joao = new Aluno("Jose", "12345");
	
	fatec.cadastrarAluno(joao);
	fatec.cadastrarAluno(jose);
	
	assertEquals(fatec.getAlunos().size(), 2);
}
 
}