Ext.define('Mall.view.MallViewPort', {
  extend: 'Ext.panel.Panel',
  xtype: 'panel-header-position',

  width: 600,
  layout: 'column',
  viewModel: true,

  bodyStyle: "background: transparent",

  defaults: {
    bodyPadding: 10,
    height: 300,
    scrollable: true
  },

  tbar: [
    {
      xtype: 'label',
      text: 'Header Position:'
    },
    {
      xtype: 'segmentedbutton',
      reference: 'positionBtn',
      value: 'top',
      defaultUI: 'default',
      items: [{
        text: 'Top',
        value: 'top'
      }, {
        text: 'Right',
        value: 'right'
      }, {
        text: 'Bottom',
        value: 'bottom'
      }, {
        text: 'Left',
        value: 'left'
      }]
    }
  ],

  items: [
    {
    columnWidth: 0.5,
    margin: "10 5 0 0",
    title: 'Panel',
    icon: null,
    glyph: 117,
    html: KitchenSink.DummyText.longText,

    bind: {
      headerPosition: '{positionBtn.value}'
    }
  },
    {
      columnWidth: 0.5,
      margin: "10 0 0 5",
      frame: true,
      title: 'Framed Panel',
      icon: null,
      glyph: 117,
      html: KitchenSink.DummyText.longText,

      bind: {
        headerPosition: '{positionBtn.value}'
      }
    }
  ]

});