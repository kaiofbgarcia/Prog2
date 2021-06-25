const resultado = {}
const somaD = (n, i=1, soma=0) => {
    if(resultado[n] > 0){
        return resultado[n];
    }else{
        if(i == n){
            resultado[n] = soma + i;
            return resultado[n];
        }else{
            if(i <= n){
                if(n%i == 0){
                    return somaD(n, i+1, soma+i);
                }else{
                    return somaD(n, i+1, soma);
                }
            }
        }
    }
}

const tempoInicio = Date.now()
somaD(1000)
const tempoFim = Date.now() - tempoInicio
console.log("Resultado da soma primeira vez: " + somaD(5000))
console.log("Duracao primeira vez: " + tempoFim + " ms")

const tempoInicioS = Date.now()
somaD(1000)
const tempoFimS = Date.now() - tempoInicioS
console.log("Resultado da soma segunda vez: " + somaD(5000))
console.log("Duracao segunda vez: " + tempoFimS + " ms")
console.log("A segunda execucao tem menor duracao pois o valor resultante já está armazenado nos resultados.")

