echo "Iniciando script..."
echo "Criando imagem"
docker build -t goden:1.0.0 .
echo "Imagem criada"
docker save -o goden.tar goden:1.0.0
echo "Finalizado!"
