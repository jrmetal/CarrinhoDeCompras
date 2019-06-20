import React from 'react';

import Icon from 'react-native-vector-icons/MaterialIcons';

import {
  Container, TabsContainer, TabItem, TabText,
} from './styles';

export default function Tabs({ translateY }) {
  return (
    <Container style={{
      transform: [{
        translateY: translateY.interpolate({
          inputRange: [0, 380],
          outputRange: [0, 30],
          extrapolate: 'clamp',
        }),
      }],
      opacity: translateY.interpolate({
        inputRange: [0, 380],
        outputRange: [1, 0.3],
        extrapolate: 'clamp',
      }),
    }}
    >
      <TabsContainer>
        <TabItem>
          <Icon name="person-add" size={24} color="#FFF" />
          <TabText>Nova Compra</TabText>
        </TabItem>
        <TabItem>
          <Icon name="chat-bubble-outline" size={24} color="#FFF" />
          <TabText>Repetir Ultima Compra</TabText>
        </TabItem>
        <TabItem>
          <Icon name="arrow-downward" size={24} color="#FFF" />
          <TabText>Saldo Disponivel</TabText>
        </TabItem>
        <TabItem>
          <Icon name="arrow-upward" size={24} color="#FFF" />
          <TabText>Notas Fiscais</TabText>
        </TabItem>
        <TabItem>
          <Icon name="lock" size={24} color="#FFF" />
          <TabText>Cadastrar Produto</TabText>
        </TabItem>
      </TabsContainer>
    </Container>
  );
}
