import styled from 'styled-components'

const Box = styled.h1`
  background: #ff;
  border-radius: 8px
`

export default function Home() {
  return(
    <main>
      <Box>
        Imagem
      </Box>
      <Box>
        Bem Vindo
      </Box>
      <Box>
        Comunidade
      </Box>
     
    </main>
  )
}
