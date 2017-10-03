/**
 * Created by plter on 7/14/17.
 */

global.APP_PATH = __dirname;
// load kotlin runtime
global.kotlin = require("./web/kotlin");
// load application
require('./web/app')