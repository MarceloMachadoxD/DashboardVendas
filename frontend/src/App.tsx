import React from 'react';
import NavBar from "components/NavBar"
import Footer from "components/Footer"
import DataTable from "components/DataTable"

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <DataTable />
        <DataTable />
        <DataTable />
        <DataTable />
        <DataTable />
  
        <h1 className="text-primary">Olá Mundo</h1>
      </div>
      <Footer />
    </>
  );
}

export default App;
