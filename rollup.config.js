import { terser } from 'rollup-plugin-terser';


const paths = {
  src: 'src/main/resources/scripts',
  dist: 'target/classes/static',
};

export default {
  input: `${paths.src}/index.js`,
  output: {
    file: `${paths.dist}/js/index.js`,
    format: 'esm',
    sourcemap: true,
    plugins: [terser()].filter(Boolean),
  },
};
