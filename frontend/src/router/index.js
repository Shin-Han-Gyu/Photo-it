import { createRouter, createWebHistory } from 'vue-router'
import MainPage from '@/views/MainPage.vue'
import Login from '@/views/Login.vue'
import SearchResult from '@/views/SearchResult.vue'
import MyPage from '@/views/MyPage.vue'
import Signup from '@/views/Signup.vue'
import FavoriteList from '@/views/FavoriteList.vue'
import MyStudio from '@/views/MyStudio.vue'
import MyStudioEdit from '@/views/MyStudioEdit.vue'
import Chat from '@/views/Chat.vue'
import ChatList from '@/views/ChatRoomList.vue'

const routes = [
  {
    path: '/',
    name: 'MainPage',
    component: MainPage,
  },
  {
    path: '/login',
    name: 'Login',
    component: Login,
  },
  {
    path: '/search/:keyword/:region/:type',
    name: 'SearchResult',
    component: SearchResult,
  },
  {
    path: '/mypage',
    name: 'MyPage',
    component: MyPage,
  },
  {
    path: '/signup',
    name: 'Signup',
    component: Signup,
  },
  {
    path: '/fav',
    name: 'FavoriteList',
    component: FavoriteList,
  },
  {
    path: '/mystudio/:nickname',
    name: 'MyStudio',
    component: MyStudio,
    props: true,
  },
  {
    path: '/mystudioedit/:nickname',
    name: 'MyStudioEdit',
    component: MyStudioEdit,
    props: true,
  },
  {
    path: '/chat/chatroom',
    name: 'Chat',
    component: Chat,
  },
  {
    path: '/chat/roomlist',
    name: 'ChatRoomList',
    component: ChatList,
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

export default router
