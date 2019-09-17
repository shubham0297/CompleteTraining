import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import Header from './Header';
import SearchForm from './SearchForm';
import Gallery from './Gallery'

export default function App() {
  return (
    <View style={styles.container}>
     <Header title={"Raja Bus Depo\n"}></Header>
     <Gallery></Gallery>
     <SearchForm></SearchForm>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    // paddingTop:50,
    flex: 1,
    backgroundColor: '#edf',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
const headerStyles = StyleSheet.create({
  container: {
    // paddingTop:50,
    flex: 1,
    backgroundColor: '#edf',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
