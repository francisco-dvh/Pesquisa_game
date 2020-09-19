import React from 'react';
import { ReactComponent as Logo } from '../../assets/Logo.svg';
import './styles.css';

const Header = () => (
  <header className="main-header">
    <Logo />
    <div className="Logo-text">
      <span className="Logo-text-1"> Big Game</span>
      <span className="Logo-text-2"> Survery</span>
    </div>
  </header>
);

export default Header;