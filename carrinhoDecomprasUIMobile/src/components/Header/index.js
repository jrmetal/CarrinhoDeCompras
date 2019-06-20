import React from 'react';

import {
  Container, Top, Logo, Title,
} from './styles';

import Icon from 'react-native-vector-icons/MaterialIcons';

import logo from '~/assets/s-l1600.jpg';

export default function Header() {
  return (
    <Container>
      <Top>
        <Logo source={logo} />
        <Title>Bem Vindo Juliano</Title>
      </Top>
      <Icon name="keyboard-arrow-down" size={20} color="#FFF" />
    </Container>
  );
}
