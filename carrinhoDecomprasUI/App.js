import React, {Component} from 'react';
import {Platform, StyleSheet, Text, View, ScrollView} from 'react-native';

export default class App extends Component {
  render() {
    return (
      <ScrollView style={styles.container}>
       
        <View style={styles.postContainer}>
          <Text style={styles.postTitle}>FEIJÃO CARIOCA BROTO LEGAL 1KG</Text>
          <Text style={styles.postDescription}>EAN:7896200115346</Text>
        </View>

        <View style={styles.postContainer}>
          <Text style={styles.postTitle}>ACHOCOLATADO NESCAU EM PÓ 2.0 LATA NESTLÉ 400G</Text>
          <Text style={styles.postDescription}>EAN:7891000053508</Text>
        </View>

        <View style={styles.postContainer}>
          <Text style={styles.postTitle}>CAFÉ PILÃO VÁCUO PURO</Text>
          <Text style={styles.postDescription}>EAN:7896089011357</Text>
        </View>

        <View style={styles.postContainer}>
          <Text style={styles.postTitle}>ESPONJA DE AÇO BOM BRIL PACOTE 60G COM 8 UNIDADES - (LÃ DE AÇO)</Text>
          <Text style={styles.postDescription}>EAN:7891022101003</Text>
        </View>
        
        <View style={styles.postContainer}>
          <Text style={styles.postTitle}>SABONETE DOVE OLEO DE ARGAN 90G DOVE</Text>
          <Text style={styles.postDescription}>EAN:7891150052437</Text>
        </View>

         <View style={styles.postContainer}>
          <Text style={styles.postTitle}>FARINHA DE TRIGO DONA BENTA TRADICIONAL 1KG</Text>
          <Text style={styles.postDescription}>EAN:17896005202071</Text>
        </View>

        <View style={styles.postContainer}>
          <Text style={styles.postTitle}>FEIJÃO CARIOCA BROTO LEGAL 1KG</Text>
          <Text style={styles.postDescription}>EAN:7896200115346</Text>
        </View>

        <View style={styles.postContainer}>
          <Text style={styles.postTitle}>ACHOCOLATADO NESCAU EM PÓ 2.0 LATA NESTLÉ 400G</Text>
          <Text style={styles.postDescription}>EAN:7891000053508</Text>
        </View>

        <View style={styles.postContainer}>
          <Text style={styles.postTitle}>CAFÉ PILÃO VÁCUO PURO</Text>
          <Text style={styles.postDescription}>EAN:7896089011357</Text>
        </View>

        <View style={styles.postContainer}>
          <Text style={styles.postTitle}>ESPONJA DE AÇO BOM BRIL PACOTE 60G COM 8 UNIDADES - (LÃ DE AÇO)</Text>
          <Text style={styles.postDescription}>EAN:7891022101003</Text>
        </View>
        
        <View style={styles.postContainer}>
          <Text style={styles.postTitle}>SABONETE DOVE OLEO DE ARGAN 90G DOVE</Text>
          <Text style={styles.postDescription}>EAN:7891150052437</Text>
        </View>

         <View style={styles.postContainer}>
          <Text style={styles.postTitle}>FARINHA DE TRIGO DONA BENTA TRADICIONAL 1KG</Text>
          <Text style={styles.postDescription}>EAN:17896005202071</Text>
        </View>

       
      </ScrollView>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#191970',
  },
  postContainer:{
    marginHorizontal: 20,
    marginVertical:10,
    padding: 20,
    backgroundColor: '#FFF',
    borderRadius:3
  },
  postTitle:{
    fontSize:18,
    color:'#708090',
    fontWeight:'bold',
    marginBottom:5
  },
  postDescription:{
    color:'#4682B4',
    fontWeight:'bold',
  }
});
