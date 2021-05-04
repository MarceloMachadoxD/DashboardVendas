import React from 'react';
import NavBar from "components/NavBar"
import Footer from "components/Footer"
import DataTable from "components/DataTable"
import BarChart from "components/BarChart"
import DonutChart from "components/DonutChart"

function App() {
  return (
    <>
      <NavBar />
      <div className="container">


        <h1 className="text-primary py-3">Dashboard de Vendas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">% Sucesso vendas</h5>
            <BarChart />
            </div>
           
            <div className="col-sm-6">
            <h5 className="text-center text-secondary">% Sucesso vendas</h5>
            <DonutChart />
            </div>
          

        </div>

        <div className="py-3">
          <h5 className=" text-secondary">Detalhe Vendas</h5>
          <DataTable />
          <DataTable />
          <DataTable />
          <DataTable />
          <DataTable />


        </div>




      </div>
      <Footer />
    </>
  );
}

export default App;
