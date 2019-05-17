import {create} from 'apisauce';

const api = create({
    baseURL : 'https://facebook.github.io/react-native',
});

api.addResponseTransform(response => {
    if(!response.ok) throw response;
});

export default api;