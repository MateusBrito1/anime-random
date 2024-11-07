# Anime Randomizer 🎲

Este é um projeto Java para buscar animes aleatórios da API do Kitsu. A aplicação faz uma requisição HTTP para obter uma lista de animes e seleciona um anime aleatório entre eles. Este projeto é ideal para praticar o consumo de APIs REST, manipulação de JSON e lógica de randomização em Java.

## Índice 

- [Visão Geral](#visão-geral)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)


## Visão Geral

Este projeto consome a [API do Kitsu](https://kitsu.docs.apiary.io/#) para buscar uma lista de animes. Após obter os dados da API, a aplicação seleciona um anime aleatório e exibe suas informações. A aplicação foi desenvolvida com Java puro, utilizando `HttpClient` para a requisição HTTP e `Gson` para o processamento do JSON.

## Tecnologias Utilizadas

- **Java 20**: Linguagem principal do projeto.
- **HttpClient**: Biblioteca nativa do Java para realizar requisições HTTP.
- **Gson**: Biblioteca para converter JSON em objetos Java e vice-versa.
- **Kitsu API**: Fonte dos dados de animes.

Exemplos de Uso
Saída Esperada

Após executar a aplicação, você deve ver uma saída semelhante a esta no terminal:
```
Anime aleatório selecionado: Anime{id=1, title='Naruto', synopsis='A história de um jovem ninja...'}

```

