// Criar uma fila

let carro = []

//adicionado veículo: FIFO
carro.push("Uno")
carro.push("Gol")
carro.push("Santana")

// visualizar a fila
console.log(carro)
//Remover da fila
carro.shift()

console.log(carro)

// fila de prioridade

let fila_priori = [
    {modelo: "Uno ", prioridade: 2},
    {modelo: "Gol ", prioridade: 2},
    {modelo: "Ambulância", prioridade: 1},
    {modelo: " Polícia", prioridade: 1}
]

fila_priori.sort((carro_a,carro_b)=> carro_a.prioridade - carro_b.prioridade)

console.log(fila_priori)
// carro a vem antes do carro b
// carro b vem antes do carro a
// se estão na mesma prioridade