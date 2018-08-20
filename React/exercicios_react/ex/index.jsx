import React from 'react'
import ReactDOM from 'react-dom'
import { combineReduces, createStore } from 'redux'
import { Provider } from 'react-redux'
import Field from './field'

const reducers = combineReduces({
    field: () => ({ value: 'Opa' })
})

ReactDOM.render(
    <Field initialValue='Teste'></Field>
, document.getElementById('app'))