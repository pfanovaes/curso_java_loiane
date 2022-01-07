###FOR
<hr>
Executa um bloco de código que está dentro do comando for, enquanto a condição for verdadeira.

for (inicializacao; condicao; atualizacao) {<br>
            // bloco de código<br>
}

###Tem variações:<br>
<u>Normal</u><br>

for (int i=0; i<5; i++) {<br>
System.out.println("i tem valor: " + i);<br>
}

<u>for com mais de uma variável<br></u>
for (int i = 0, j = 10; i < j; i++, j--) {<br>
System.out.println("i tem valor: " + i " e j tem valor: " + j);<br>
}<br>
<u>Partes ausentes</u><br>
<br>
int i = 0; <br>
for (; i<5; ) {<br>
System.out.println("i tem valor de " + i); <br>
i++; <br>
}<br>
<br>
<u>Loop sem corpo</u> <br>
<br>
int soma = 0;<br>
for(int i = 1; i < 5; soma+= i++) <br>
System.out.println("O valor da soma é:" + soma); <br>