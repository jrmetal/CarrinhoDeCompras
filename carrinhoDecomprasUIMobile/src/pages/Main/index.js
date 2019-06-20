import React from 'react';
import Icon from 'react-native-vector-icons/MaterialIcons';

import { Animated } from 'react-native';
import { PanGestureHandler, State } from 'react-native-gesture-handler';

import Header from '~/components/Header';
import Tabs from '~/components/Tabs';
import Menu from '~/components/Menu';

import {
  Container, Content, Card, CardHeader, CardContent, CardFooter, Title, Description, Annotation,
} from './styles';

export default function Main() {
  let offset = 0;
  const translateY = new Animated.Value(0);

  const animatedEvent = Animated.event(
    [
      {
        nativeEvent: {
          translationY: translateY,
        },
      },
    ],
    { useNativeDriver: true },
  );

  function onHandlerStateChanged(event) {
    if (event.nativeEvent.oldState === State.ACTIVE) {
      let opened = false;
      const { translationY } = event.nativeEvent;

      offset += translationY;

      if (translationY >= 100) {
        opened = true;
      } else {
        translateY.setValue(offset);
        translateY.setOffset(0);
        offset = 0;
      }

      Animated.timing(translateY, {
        toValue: opened ? 380 : 0,
        duration: 200,
        useNativeDriver: true,
      }).start(() => {
        offset = opened ? 380 : 0;
        translateY.setOffset(offset);
        translateY.setValue(0);
      });
    }
  }

  return (
    <Container>
      <Header />

      <Content>
        <Card style={{
          transform: [{
            translateY: translateY.interpolate({
              inputRange: [-350, 0, 380],
              outputRange: [-50, 0, 380],
              extrapolate: 'clamp',
            }),
          }],
        }}
        >
          <CardContent>
            <Title>Ultima Compra</Title>
            <Description>Assai Atacadista</Description>
            <Description>R$ 211,65</Description>
          </CardContent>
          <CardFooter>
            <Annotation>
             Seu eu Comprar pelo o App o desconto é maior ainda
              </Annotation>
          </CardFooter>
        </Card>
      </Content>

      <Tabs translateY={translateY} />
      <CardContent>
        <Title>2019 - Desonvolvido por Juliano Razzo</Title>
      </CardContent>
    </Container>

  );
}
