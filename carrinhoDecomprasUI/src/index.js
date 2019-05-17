import React, {Component} from 'react';
import {Platform, StyleSheet, Text, View, ScrollView, Button, ActivityIndicator} from 'react-native';
import api from './services/api';

export default class App extends Component {
  constructor(props){
    super(props);
    this.state = {
      isLoading : true,
      dataSource : null,
    }
    this.loadProduct = this.loadProduct.bind(this);
    this.back = this.back.bind(this);
  }

  loadProduct(){ 
    return fetch('http://192.168.16.3:8282/CarrinhoDeCompras-web/webresources/Test')
        .then((response) => response.json())
        .then((responseJson) => {

          this.setState({
            isLoading:false,
            dataSource : responseJson,
          })
        }).catch((error) => {
          console.log(error);
        });
  }

  back(){
    return (
      this.setState({
        isLoading:true,
        dataSource : null,
      })
    );
  }

  render() {  
      if(this.state.isLoading){

        return (
          <View style={styles.container}>
            <View style={styles.space}></View>
        
            <View style={styles.header}> 
            <Text style={styles.headeTitle}>Bem Vindo ao Carrinho de Compras</Text>
            </View>

            <View style={styles.containerMiddle}>
            <Button onPress={this.loadProduct }title='Mostrar Produtos'/>
            </View>

          </View>
        )
        
      }else{
         let products = this.state.dataSource.map((val,key) =>{
            return  <View key={key} style={styles.postContainer}>
                      <Text style={styles.postDescription}>Descricao Do Produto</Text>
                      <Text style={styles.postTitle}>{val.description}</Text>
                      <Text style={styles.postDescription}>EAN {val.barCode}</Text>
                      <Text style={styles.postDescription}>Status {val.status}</Text>
                      <Text style={styles.postDescription}>Data da Criação {val.createdTime}</Text>
                      <Text style={styles.postDescription}>Medida {val.measurement}</Text>
                      <Text style={styles.postDescription}>Imagem {val.img}</Text>
                    </View>
        });
        return <ScrollView style={styles.container} >
                  <View style={styles.space}></View>

                  <View style={styles.containerRight}>
                    <Button onPress={this.back }title='Voltar'/>
                   </View>
                  
                  <View style={styles.header}> 
                  
                  <Text style={styles.headeTitle}>Produtos Disponíveis</Text>
                  </View>
                  {products}
              </ScrollView>
      }


  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#8B10AE',
  },
  postContainer:{
    marginHorizontal: 20,
    marginVertical:10,
    padding: 20,
    backgroundColor: '#FFF',
    borderRadius:3
  },
  postTitle:{
    fontSize:14,
    color:'#708090',
    fontWeight:'bold',
    marginBottom:5
  },
  postDescription:{
    color:'#4682B4',
    fontWeight:'bold',
  },
  space:{
    height:20,
  },
  containerMiddle:{
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center'

  },
  containerRight:{
    flex: 1,
    alignItems: 'flex-end',
    marginRight:20
  
  },
  header:{
    alignItems: 'center',

  },
  headeTitle:{
    fontSize:16,
    color:'#FFF',
    fontWeight:'bold',
  }
});
